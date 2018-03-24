package br.com.welton.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Formulario() {
		this.setLayout(new BorderLayout(10,20));
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(newJpanel(), BorderLayout.NORTH);
		this.add(newJpanel(), BorderLayout.CENTER);
		this.add(newJpanel(), BorderLayout.SOUTH);
		this.add(newJpanel(), BorderLayout.WEST);
		this.add(newJpanel(), BorderLayout.EAST);

	}
	
	
	private JPanel newJpanel() {
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(100,100));
		p.setBorder(new LineBorder(Color.BLACK));
		return p;
	}
}
