package com.newer.foo;

import com.newer.office.Doc;
import com.newer.office.DocType;
import com.newer.office.Office;
import com.newer.office.Word;

public class App {

	public static void main(String[] args) {
		
		Doc doc = Office.create(DocType.EXCEL);
		doc.edit();
		
		doc = Office.create(DocType.WORD, "简历");
		doc.edit();
		
		doc = Office.create(DocType.PPT, "产品演示");
		doc.edit();
		
		// 微博：用户、状态、回复
		// 单例模式
		// builder 模式
		// 工厂模式
		// 产品的构造方法封闭了，提供了一个唯一的开放的接口
		Word w = (Word) Office.create(DocType.WORD);
		
		
	}
}
