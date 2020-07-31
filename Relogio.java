import javax.swing.GroupLayout.SequentialGroup;

public class Relogio {
    int hora;
    int minuto;
    int segundo;

    //inicia o relogio com hora: 00:00:00
    public Relogio ()
    {
        this.hora =00;
        this.minuto = 00;
        this.segundo = 00;

    }

    public void setHora(int hr, int min, int seg)
    {
        if ((hr>=0) && (hr<=24))
        {
            this.hora = hr;
        }
        else
        {
            System.out.println("hora invalida!");
        }

        if ((min>=0) && (min<=60))
        {
            this.minuto = min;
        }
        else
        {
            System.out.println("Minutos invalidos");
        }
        
        if ((seg>=0) && (seg<=60))
        {
            this.segundo = seg;
        }
        else
        {
            System.out.println("Segundos invalidos");
        }


    }

    public void getHoras()
    {
 //       System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
        System.out.printf("%02d:%02d:%02d",this.hora,this.minuto,this.segundo);


    }


}