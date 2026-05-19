public  class   Controlador {
    
    public void showDeberGrupal(){
        ControladorPedro controladorPedro = new ControladorPedro();
        controladorPedro.showDeber();
        
        ControladorJhonatan controladorJhonatan = new ControladorJhonatan();
        controladorJhonatan.mostrarDeberJhonatan();

        ControladorMatias controladorMatias = new ControladorMatias();
        controladorMatias.mostrarDeberMatias();
    }
}