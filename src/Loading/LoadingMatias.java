package Loading;

public class LoadingMatias {

    public void loadingfor(int tamanoBarra) {
        int limite = tamanoBarra - 3; 

        for (int i = 0; i <= limite; i++) {
            int porcentaje = (i * 100) / limite;
            
            System.out.printf("\r[%-" + limite + "s] %d%%", " ".repeat(i) + "<=>", porcentaje);

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }

    public void loadingwhile(int tamanoBarra) {
        int limite = tamanoBarra - 3;
        int i = 0;
        while(i<=limite){
            int porcentaje = (i*100) / limite;

            System.out.printf("\r[%-" + limite + "s] %d%%", " ".repeat(i) + "<=>", porcentaje);

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            i++;
        }
        System.out.println("\nCarga completa.");
    }

    public void loadingDoWhile(int tamanoBarra){
        int limite = tamanoBarra - 3;
        int i = 0;
        do{
            int porcentaje = (i*100) / limite;

            System.out.printf("\r[%-" + limite + "s] %d%%", " ".repeat(i) + "<=>", porcentaje);

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            i++;
        }while(i<=limite);
        System.out.println("\nCarga completa.");
    }
}