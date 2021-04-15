package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Densidad;
import modelo.Dificultad;
import vista.UI;

public class ParaUI extends UI {

	private Controlador control;

	public ParaUI() {
		super();
		control = new Controlador();
		// leyes de demeter
		// para solucionar esto es crear metodos delegados
//		jPanelOpciones.btnIniciar.addActionListener(l);
		getBtnIniciar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Densidad densidad=(Densidad) getCmbDensidad().getSelectedItem();
				System.out.println(densidad);
				Dificultad dificultad = (Dificultad) getCmbDificultad().getSelectedItem();
				System.out.println(dificultad.getLongitud());
				control.dameValores(densidad,dificultad);

			}
		});
	}

}
