package uao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dao.Multiplication;
import bao.MultiplicationLogic;

public class MultiplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Multiplication m=(Multiplication)bf.getBean("mul");
		int i=new MultiplicationLogic().mul(m.getA(),m.getB());
		System.out.println(i);
	}

}
