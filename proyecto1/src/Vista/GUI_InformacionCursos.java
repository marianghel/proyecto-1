/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Cursos;

/**
 *
 * @author Marianghel
 */
public class GUI_InformacionCursos extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionCursos
     */
    Controlador_FRM_Cursos controlador;

    public GUI_InformacionCursos() {
        initComponents();
        cargarCreditos();
    }

    public void agregarControlador(Controlador_FRM_Cursos controlador) {
        this.controlador = controlador;

    }

    public void cargarCreditos() {
        this.jcb_Creditos.removeAllItems();
        for (int contador = 0; contador < 10; contador++) {
            this.jcb_Creditos.addItem("" + contador);
        }
        this.jcb_Creditos.setSelectedIndex(4);
    }

    public String[] devolverInformacion() {
        String arreglo[];
        arreglo = new String[4];
        arreglo[0] = this.jt_Sigla.getText();
        arreglo[1] = this.jt_Nombre.getText();
        arreglo[2] = "" + this.jcb_Creditos.getSelectedIndex();
        arreglo[3] = this.jt_Horario.getText();

        return arreglo;

    }

    public String devolverSigla() {
        return this.jt_Sigla.getText();
    }

    public String devolverNombre() {
        return this.jt_Nombre.getText();
    }

    public int devolverCreditos() {
        return this.jcb_Creditos.getSelectedIndex();
    }

    public String devolverHorario() {
        return this.jt_Horario.getText();
    }

    public void mostrarInformacion(String arreglo[]) {
        this.jt_Sigla.setText(arreglo[0]);
        this.jt_Nombre.setText(arreglo[1]);
        this.jcb_Creditos.setSelectedIndex(Integer.parseInt(arreglo[2]));
        this.jt_Horario.setText(arreglo[3]);
    }

    public void limpiarInterfaz() {
        this.jt_Nombre.setText("");
        this.jt_Horario.setText("");
        this.jt_Sigla.setText("");
    }

    public void estadoInicial() {
        this.jt_Sigla.setEnabled(true);
        this.jt_Nombre.setEnabled(false);
        this.jt_Horario.setEnabled(false);
        this.jcb_Creditos.setEnabled(false);
    }

    public void hablilitarSiExiste() {
        this.jt_Sigla.setEnabled(false);
        this.jt_Horario.setEnabled(true);
        this.jcb_Creditos.setEnabled(true);
        this.jt_Nombre.setEnabled(true);
    }

    public void habilitarNoExiste() {
        this.jt_Sigla.setEnabled(true);
        this.jt_Horario.setEnabled(true);
        this.jcb_Creditos.setEnabled(true);
        this.jt_Nombre.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Sigla = new javax.swing.JLabel();
        jl_Creditos = new javax.swing.JLabel();
        jl_NombreCurso = new javax.swing.JLabel();
        jl_Horario = new javax.swing.JLabel();
        jt_Sigla = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jcb_Creditos = new javax.swing.JComboBox<>();
        jt_Horario = new javax.swing.JTextField();

        jl_Sigla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_Sigla.setText("Sigla");

        jl_Creditos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_Creditos.setText("Créditos");

        jl_NombreCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_NombreCurso.setText("Nombre curso");

        jl_Horario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_Horario.setText("Horario");

        jt_Sigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_SiglaKeyPressed(evt);
            }
        });

        jt_Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jcb_Creditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jt_Horario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Sigla)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jl_Creditos)
                    .addComponent(jl_Horario))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jt_Nombre)
                        .addComponent(jcb_Creditos, 0, 192, Short.MAX_VALUE)
                        .addComponent(jt_Horario))
                    .addComponent(jt_Sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Sigla)
                    .addComponent(jt_Sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Creditos)
                    .addComponent(jcb_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Horario))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_SiglaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_SiglaKeyPressed
        if (evt.getKeyCode() == 10) {
            controlador.buscar();
        }
    }//GEN-LAST:event_jt_SiglaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcb_Creditos;
    private javax.swing.JLabel jl_Creditos;
    private javax.swing.JLabel jl_Horario;
    private javax.swing.JLabel jl_NombreCurso;
    private javax.swing.JLabel jl_Sigla;
    private javax.swing.JTextField jt_Horario;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Sigla;
    // End of variables declaration//GEN-END:variables
}
