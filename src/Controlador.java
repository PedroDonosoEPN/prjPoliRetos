public  class   Controlador {
    
    public void showDeberGrupal(){
        ControladorPedro controladorPedro = new ControladorPedro();
        //Serie Numerica
        controladorPedro.showDeber();
        
        ControladorJhonatan controladorJhonatan = new ControladorJhonatan();
        controladorJhonatan.mostrarDeberJhonatan();

    }
}