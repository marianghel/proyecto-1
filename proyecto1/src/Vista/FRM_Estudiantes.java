
package Vista;

import Controlador.Controlador_FRM_Estudiantes;
import javax.swing.JOptionPane;


public class FRM_Estudiantes extends javax.swing.JFrame {
public Controlador_FRM_Estudiantes controlador_FRM_Estudiantes;
    
    public FRM_Estudiantes() {
        initComponents();
        setLocation(250,150);
        controlador_FRM_Estudiantes=new Controlador_FRM_Estudiantes(this);
        gUI_Botones1.agregarEventos(controlador_FRM_Estudiantes);
      this.gUI_InformacionEstudiantes1.agregarEventos(controlador_FRM_Estudiantes);
      this.gUI_InformacionEstudiantes1.agregarControlador(controlador_FRM_Estudiantes);
        estadoInicial();
    }

     public String[] devolverInformacion()
    {
        return this.gUI_InformacionEstudiantes1.devolverInformacion();
    }
    public String devolverCedula()
    {
        return this.gUI_InformacionEstudiantes1.devolverCedula();
    
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_InformacionEstudiantes1.mostrarInformacion(arreglo);
    }
     public void estadoInicial(){
        this.gUI_InformacionEstudiantes1.estadoInicial();
        this.gUI_Botones1.estadoInicial();
    }
     public void mostrarMensaje(String mensaje){
       JOptionPane.showMessageDialog(null,mensaje);
   }
    public void limpiarInterfaz(){
        this.gUI_InformacionEstudiantes1.limpiarInterfaz();
    }
    public void agregar(){
        this.gUI_InformacionEstudiantes1.habilitarNoExiste();
        this.gUI_Botones1.habilitarAgregar();
    }
    public void modificaElimina(){
        this.gUI_Botones1.habilitarExistencia();
        this.gUI_InformacionEstudiantes1.hablilitarSiExiste();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionEstudiantes1 = new Vista.GUI_InformacionEstudiantes();
        gUI_Botones1 = new Vista.GUI_Botones();
        jl_Titulo = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_InformacionEstudiantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(gUI_Botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 269, -1, -1));

        jl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Titulo.setText("Registro Estudiante");
        getContentPane().add(jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 22, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoE.png"))); // NOI18N
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
       controlador_FRM_Estudiantes.agregarInformacionAlArchivo();
    }//GEN-LAST:event_formComponentHidden

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionEstudiantes gUI_InformacionEstudiantes1;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Titulo;
    // End of variables declaration//GEN-END:variables
}