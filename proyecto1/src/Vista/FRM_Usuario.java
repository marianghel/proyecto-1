
package Vista;

import Controlador.Controlador_FRM_MenuPrincipal;
import Controlador.Controlador_FRM_Usuario;
import javax.swing.JOptionPane;

public class FRM_Usuario extends javax.swing.JFrame {

    public Controlador_FRM_Usuario controlador;
    Controlador_FRM_MenuPrincipal controladorP;
    public FRM_Usuario(Controlador_FRM_MenuPrincipal controladorP) {
        initComponents();
       setLocationRelativeTo(null);
       this.controladorP=controladorP;
       controlador= new Controlador_FRM_Usuario(this,controladorP);
       this.gUI_InformacionUsuario1.agregarControlador(controlador);
       this.gUI_Botones1.agregarEventos(controlador);
        estadoInicio();
    }

    public void agregar(){
        this.gUI_Botones1.habilitarAgregar();
        this.gUI_InformacionUsuario1.habilitar();
    }
    public String devolverNombreU(){
      return  this.gUI_InformacionUsuario1.devolverNombreUsuario();
    }
        public String devolverContrasena(){
        return this.gUI_InformacionUsuario1.devolverContrasena();
    }
        public String devolverNombreC(){
            return this.gUI_InformacionUsuario1.devolverNombreC();
        }
    public String devolverTipo(){
        return this.gUI_InformacionUsuario1.devolverTipo();
    }
    public String[] devolverInformacion() {
         return this.gUI_InformacionUsuario1.devolverInformacion();
    }
public void modificarEliminar(){
    this.gUI_Botones1.habilitarExistencia();
    this.gUI_InformacionUsuario1.habilitar();
}
public void mostrarInformacion(String arreglo[]){
    this.gUI_InformacionUsuario1.mostrarInfo(arreglo);
}
public String[]  informacion(){
   return this.gUI_InformacionUsuario1.devolverInformacion();
}
public void limpiarVentana(){
    this.gUI_InformacionUsuario1.limpiarIntefaz();
}
public void estadoInicio(){
    this.gUI_InformacionUsuario1.estadoInicial();
    this.gUI_Botones1.estadoInicial();
}
   public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionUsuario1 = new Vista.GUI_InformacionUsuario();
        gUI_Botones1 = new Vista.GUI_Botones();
        jl_Fondo = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_InformacionUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        getContentPane().add(gUI_Botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoU.png"))); // NOI18N
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
           controlador.agregarInformacionCuandoCierraVentana();
           controladorP.mostrarLogin();        
    }//GEN-LAST:event_formComponentHidden

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionUsuario gUI_InformacionUsuario1;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables
}
