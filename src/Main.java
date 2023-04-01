import controlador.ControladorEspecialidadGUI;
import modelo.ModeloEspecialidad;
import vista.VistaEspecialidadGUI;

public class Main {
    public static void main(String[] args) {
        ModeloEspecialidad mp = new ModeloEspecialidad();
        VistaEspecialidadGUI vp = new VistaEspecialidadGUI();
        ControladorEspecialidadGUI cp = new ControladorEspecialidadGUI(mp,vp);
    }
}