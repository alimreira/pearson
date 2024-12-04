package com.example.pearsonFive.mainApp;

import com.example.pearsonFive.configuring.Pojo1;
import com.example.pearsonFive.configuring.Pojo2;
import com.example.pearsonFive.looseCoupling.BinarySearching;
import com.example.pearsonFive.looseCoupling.Sorted;
import com.example.pearsonFive.makingBeans.DoubleInstances1;
import com.example.pearsonFive.makingBeans.SingleInstances1;
import com.example.pearsonFive.test.JollofRice;
import com.example.pearsonFive.test.PepperMix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.example.pearsonFive")
public class PearsonFiveApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(PearsonFiveApplication.class, args);
//		DoubleInstances1 dbl = ctx.getBean(DoubleInstances1.class);
//		DoubleInstances1 dbl1 = ctx.getBean(DoubleInstances1.class);
//		DoubleInstances1 dbl2 = ctx.getBean(DoubleInstances1.class);
//		System.out.println(dbl);
//		System.out.println(dbl1);
//		System.out.println(dbl2);

		SingleInstances1 sle = ctx.getBean(SingleInstances1.class);
		SingleInstances1 sle1 = ctx.getBean(SingleInstances1.class);
		SingleInstances1 sle2 = ctx.getBean(SingleInstances1.class);
		System.out.println(sle);
		System.out.println(sle1);
		System.out.println(sle2);

		Pojo1 pp = ctx.getBean("pojo1", Pojo1.class);
		Pojo1 pp1 = ctx.getBean("ben" , Pojo1.class);
		Pojo1 pp2 = ctx.getBean("ben", Pojo1.class);
		System.out.println(pp);
		System.out.println(pp1);
		System.out.println(pp2);

		Pojo2 ppo1 = ctx.getBean("pojo2", Pojo2.class);
		Pojo2 ppo2 = ctx.getBean("pojo2b" ,Pojo2.class);
		Pojo2 ppo3 = ctx.getBean("pojo2b", Pojo2.class);
		System.out.println(ppo1);
		System.out.println(ppo2);
		System.out.println(ppo3);

		BinarySearching bsh = ctx.getBean(BinarySearching.class);
		int[] arr = {22,20,17,2,10,1,18,8};
		int test = bsh.sortThenSearch(arr,22);
		System.out.println(test);
		System.out.println(bsh);

		Sorted str = ctx.getBean(Sorted.class);
		str.getSorted(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);

		PepperMix pm = new PepperMix();
		pm.jollofRice();

	}

}
