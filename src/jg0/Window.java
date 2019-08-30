package jg0;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
	JPanel window, speech, world, chart, charAndSmth, worldAndSpch, smth;
	JFrame f;
	JLabel Tstr, Tdext, Tintl, Tvol, Thp, Texp, str, dext, intl, vol, hp, exp, spch; 
	
	
	public Window(){
		
		f = new JFrame();
		f.setBounds(100, 100, 1000, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window = new JPanel();
		window.setLayout(new BorderLayout());
		
		charAndSmth = new JPanel();
		charAndSmth.setBorder(BorderFactory.createLineBorder(Color.black));
		charAndSmth.setLayout(new GridLayout(2, 1));
		
		smth = new JPanel();
		smth.setBorder(BorderFactory.createLineBorder(Color.black));
		charAndSmth.add(smth);
		
		chart = new JPanel();
		chart.setBorder(BorderFactory.createLineBorder(Color.black));
		chart.setLayout(new GridLayout(6, 2));
		
		Thp = new JLabel("Hp"); Thp.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Thp);
		hp = new JLabel(/* Hero.getHp()+"/"+Hero.getHp0() */); hp.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(hp);
		Tstr = new JLabel("Str");  Tstr.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Tstr);
		str = new JLabel(/* Hero.getStr() */);  str.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(str);
		Tdext = new JLabel("Dext");  Tdext.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Tdext);
		dext = new JLabel(/* Hero.getDext() */); dext.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(dext);
		Tintl = new JLabel("Int");  Tintl.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Tintl);
		intl = new JLabel(/* Hero.getIntl() */);  intl.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(intl);
		Tvol = new JLabel("Vol");  Tvol.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Tvol);
		vol = new JLabel(/* Hero.getVol() */); vol.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(vol);
		Texp = new JLabel("Exp");  Texp.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(Texp);
		exp = new JLabel(/* Hero.getExp() */);  exp.setBorder(BorderFactory.createLineBorder(Color.black));
		 chart.add(exp);
		 
		charAndSmth.add(chart);
		
		worldAndSpch = new JPanel();
		worldAndSpch.setBorder(BorderFactory.createLineBorder(Color.black));
		worldAndSpch.setLayout(new GridLayout(2, 1));
		
		speech = new JPanel();
		speech.setBorder(BorderFactory.createLineBorder(Color.black));
		
		spch = new JLabel("Здесь будет выводится текст речи мобов, состояния и проч.");
		speech.add(spch);
		worldAndSpch.add(speech);
		
		world = new JPanel();
		world.setBorder(BorderFactory.createLineBorder(Color.black));
		worldAndSpch.add(world);
		
		
		
		
		
		
		window.add(worldAndSpch, BorderLayout.CENTER);
		window.add(charAndSmth, BorderLayout.WEST);
		
		f.add(window);
		
		
		
		
		
		
		
		f.setFocusable(true);
		f.setVisible(true);
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Window game = new Window();
		
	}

}
