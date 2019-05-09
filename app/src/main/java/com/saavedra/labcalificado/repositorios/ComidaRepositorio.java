package com.saavedra.labcalificado.repositorios;

import  com.saavedra.labcalificado.modelo.Comidas;

import java.util.ArrayList;
import java.util.List;



public class ComidaRepositorio {

    private static List<Comidas> comida = new ArrayList<>();

    static {
        comida.add(new Comidas("1", "MonsterEnergy", "866-322-4466", "imagen1", "monster@hotmail.com", "Las Mejores Bebidas Energizantes","Corona, CA 92879", "Energisantes","https://www.monsterenergy.com/"));
        comida.add(new Comidas("2", "Subway", "(01) 2431329", "imagen2", "subwayhotmail.com", "Sandwiches y ensaldas Riquisimas!","Av.La brazil", "Chatarra","http://www.subway.pe/"));
        comida.add(new Comidas("3", "Wendy's", "(01)540-0756", "imagen3", "wendy@hotmail.com", "comida rapida de hamburguesas","Av.La Japon", "Chatarra","https://www.wendys.com/"));
        comida.add(new Comidas("4", "Red Bull", "(01)259-0756", "imagen4", "red@hotmail.com", "Bebida Energetica!","Av.La Argentina", "Chatarra","https://www.redbull.com/pe-es/"));
        comida.add(new Comidas("5", "Mc Donald's", "(01)340-214", "imagen5", "mc@hotmail.com", "Comida Rapida","Av.La Nicaragua", "Chatarra","http://www.mcdonalds.com.pe/"));
        comida.add(new Comidas("6", "Dominos", "(01)259-0756", "imagen6", "domino@hotmail.com", "Pizza de Dominos","Av.La Javer Prado", "Chatarra","http://www.dominos.com.pe/"));
        comida.add(new Comidas("7", "Norky's", " (01) 4629800", "imagen7", "Norkys@hotmail.com", "Pollo a la brasa!","Av.La Lima", "Chatarra","http://norkys.pe/"));
        comida.add(new Comidas("8", "StarBucks", "(01)123-0756", "st", "Star@hotmail.com", "Ventade Cafe y postres","Av.La Universitaria", "Chatarra","http://www.starbucks.com.pe/"));
        comida.add(new Comidas("9", "KFC", "(01)340-3265", "kfc", "kfc@hotmail.com", "Delicioso pollo frito","Av.La Cascanueces", "Chatarra","https://www.kfc.com/"));
        comida.add(new Comidas("10", "PizzaHut", "(01)340-9587", "pizza", "pizza@hotmail.com", "Ventas de Pizzas!","Av.La Anita", "Chatarra","https://www.telepizza.com/"));
        }
    public static List<Comidas> getList(){
        return comida;
    }
}
