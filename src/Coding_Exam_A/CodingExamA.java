package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		int robotct = Integer.parseInt(JOptionPane.showInputDialog("Enter Robot Count"));
		String s = JOptionPane.showInputDialog("Enter Valid RGB, seperated by a single space");
		int r = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		int g = Integer.parseInt(s.substring(s.indexOf(" ")+1,s.lastIndexOf(" ")));
		int b = Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
		Color c = new Color(r,g,b);
		int sidect = Integer.parseInt(JOptionPane.showInputDialog("Enter side Count"));
		Robot[] robots = new Robot[robotct];
		for (int i =0;i<robotct;i++) {
			robots[i]=new Robot(400+400*i,700);
		}
		int angle = (sidect-2)*180/sidect;
		Thread[] t = new Thread[robotct];
		

	}
}
