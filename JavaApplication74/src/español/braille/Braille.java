package español.braille;

public class Braille implements ITraductor {

    private String Texto;
    private final String a[] = new String[2];
    

    public Braille(String Texto) {
        this.Texto = Texto;
        a[0]="";
        a[1]="";
    }

    @Override
    public String getTexto() {
        return Texto;
    }

    @Override
    public void setTexto(String Texto) {
        this.Texto = Texto;
        switch (Texto) {
            case " ":
                this.a[0] +="&ensp;";  this.a[1]+=Texto+"&ensp;";
                break;
            case "a":
                this.a[0] +="&#10241;"; this.a[1]+=Texto;
                break;
            case "b":
                this.a[0] +="&#10243;"; this.a[1]+=Texto;
                break;
            case "c":
                this.a[0] +="&#10249;"; this.a[1]+=Texto;
                break;
            case "d":
                this.a[0] +="&#10265;"; this.a[1]+=Texto;
                break;
            case "e":
                this.a[0] +="&#10257;"; this.a[1]+=Texto;
                break;
            case "f":
                this.a[0] +="&#10251;"; this.a[1]+=Texto;
                break;
            case "g":
                this.a[0] +="&#10267;"; this.a[1]+=Texto;
                break;
            case "h":
                this.a[0] +="&#10259;"; this.a[1]+=Texto;
                break;
            case "i":
                this.a[0] +="&#10250;"; this.a[1]+=Texto;
                break;
            case "j":
                this.a[0] +="&#10266;"; this.a[1]+=Texto;
                break;
            case "k":
                this.a[0] +="&#10245;"; this.a[1]+=Texto;
                break;
            case "l":
                this.a[0] +="&#10247;"; this.a[1]+=Texto;
                break;
            case "m":
                this.a[0] +="&#10253;"; this.a[1]+=Texto;
                break;
            case "n":
                this.a[0] +="&#10269;"; this.a[1]+=Texto;
                break;
            case "o":
                this.a[0] +="&#10261;"; this.a[1]+=Texto;
                break;
            case "p":
                this.a[0] +="&#10255;"; this.a[1]+=Texto;
                break;
            case "q":
                this.a[0] +="&#10271;"; this.a[1]+=Texto;
                break;
            case "r":
                this.a[0] +="&#10263;"; this.a[1]+=Texto;
                break;
            case "s":
                this.a[0] +="&#10254;"; this.a[1]+=Texto;
                break;
            case "t":
                this.a[0] +="&#10270;"; this.a[1]+=Texto;
                break;
            case "u":
                this.a[0] +="&#10277;"; this.a[1]+=Texto;
                break;
            case "v":
                this.a[0] +="&#10279;"; this.a[1]+=Texto;
                break;
            case "w":
                this.a[0] +="&#10298;"; this.a[1]+=Texto;
                break;
            case "x": 
                this.a[0] +="&#10285;"; this.a[1]+=Texto;
                break;
            case "y":
                this.a[0] +="&#10301;"; this.a[1]+=Texto;
                break;
            case "z":
                this.a[0] += "&#10293;"; this.a[1]+=Texto;
                break;
        }
    }
        @Override
        public String[] Traducir() {
            return a;
        }
    }
