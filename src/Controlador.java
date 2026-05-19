public  class   Controlador {
    
    public void showDeberGrupal(){
      

        ControladorPedro controladorPedro = new ControladorPedro();
        controladorPedro.showDeber();
        
        ControladorJhonatan controladorJhonatan = new ControladorJhonatan();
        controladorJhonatan.mostrarDeberJhonatan();

          ControladorEidan controladorEidan = new ControladorEidan();
        controladorEidan.mostrarDeberEidan(); 
        
      


    }
}