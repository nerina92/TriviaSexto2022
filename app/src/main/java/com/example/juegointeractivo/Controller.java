package com.example.juegointeractivo;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

//en el proyecto explicar que las preguntas hoy son locales pero que se evauo usar una api en un futuro
//uso libreria picaso y archivos locales... explicar diferencia
public class Controller {
    ArrayList<Pregunta> preguntas;

    public Controller(Context context, String tema) {

        preguntas = new ArrayList<>();

    //String tema= "";
        Pregunta p1=null, p2=null, p3=null, p4=null, p5=null, p6=null, p7=null, p8=null, p9=null, p10=null;
        Pregunta p11=null, p12=null, p13=null, p14=null, p15=null, p16=null, p17=null, p18=null, p19=null, p20=null ,p21=null, p22=null, p23=null;
    switch (tema) {
            case "matemática":
                p1= new Pregunta("¿Cuanto es 6+3?", "https://i.ytimg.com/vi/Ys7XT3MFosE/maxresdefault.jpg",
                        "12","15","9","11", 3);
                p2 = new Pregunta("¿Cuantos es 4-2?", "https://content.anton.app/files/?fileId=image%2Flsg_032f1cc3cf&etag=f9b2-6021.jpg",
                        "2","1","3","4", 1);
                p3= new Pregunta("¿Cuanto es 2x7?", "https://www.ars108.com/uploads/1/3/4/5/134574831/my-post-4_orig.png",
                        "16","14","10","12", 2);
                p4= new Pregunta("¿Cuanto es 50+8?", "https://th.bing.com/th/id/OIP.XFbS5M5SX__bphcrr3T-rAAAAA?pid=ImgDet&rs=1",
                        "60","57","62","58",4);
                p5= new Pregunta("¿Cuanto es 10+7?", "https://cdn.kastatic.org/ka-exercise-screenshots/addition_2.png",
                        "17","13","16","15",1);
                p6= new Pregunta("¿Que tipo de figura geometrica es?", "https://1.bp.blogspot.com/-VNalo8k09kw/Vt1FYVYE_rI/AAAAAAAAC2Y/-y5OSZuPAWo/s400/triangulo-amarillo.jpg",
                        "Cuadrado", "Triangulo", "Circulo", "Rectangulo", 2);
                p7= new Pregunta("¿Que tipo de figura geometrica es?", "https://images.emojiterra.com/openmoji/v12.2/512px/1f7e8.png",
                        "Pentagono", "Rombo", "Cuadrado", "Triangulo", 3);
                p8= new Pregunta("¿Que tipo de figura geometrica es?", "https://www.caracteristicass.de/wp-content/uploads/2018/10/caracteristicas-del-rombo-300x214.jpg",
                        "Circulo", "Rombo","Rectangulo", "Triangulo", 2);
                p9= new Pregunta("¿Que tipo de figura geometrica es?", "https://o.quizlet.com/GU3cmmUzmixTCO76mb.pfQ.jpg",
                        "Hexagono", "Triangulo", "Rectangulo", "Pentagono", 4);
                p10= new Pregunta("¿Que tipo de figura geometrica es?", "https://images.emojiterra.com/openmoji/v12.2/512px/1f7e1.png",
                        "Cuadrado", "Circulo", "Rectangulo", "Triangulo", 2);

                break;
        case "señales de transito":
            p1 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349551264096326/Stop.png",context.getString(R.string.op11),context.getString(R.string.op12),context.getString(R.string.op13),context.getString(R.string.op14),3);//el entero es el numero de respuesta correcta. Stop
            p2 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349551020810260/rotonda.webp?width=655&height=655",context.getString(R.string.op15),context.getString(R.string.op13),context.getString(R.string.op16),context.getString(R.string.op17),1);//el entero es el numero de respuesta correcta. Seda el paso
            p3 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349549586350150/seda_el_paso.png?width=742&height=655",context.getString(R.string.op110),context.getString(R.string.op19),context.getString(R.string.op18),context.getString(R.string.op14),4);//el entero es el numero de respuesta correcta
            p4 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349548978188388/prohibido_estacionar.jpg?width=655&height=655",context.getString(R.string.op12),context.getString(R.string.op110),context.getString(R.string.op19),context.getString(R.string.op18),3);//el entero es el numero de respuesta correcta
            p5 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349550441992232/contra_mano.jpg",context.getString(R.string.op113),context.getString(R.string.op112),context.getString(R.string.op15),context.getString(R.string.op12),1);//el entero es el numero de respuesta correcta
            p6 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349550190358538/limi.png?width=587&height=655",context.getString(R.string.op112),context.getString(R.string.op19),context.getString(R.string.op13),context.getString(R.string.op114),4);//el entero es el numero de respuesta correcta
            p7 = new Pregunta(context.getString(R.string.Pregunta1), "https://media.discordapp.net/attachments/970748327568224289/978349550756593695/izquierda.jpg",context.getString(R.string.op19),context.getString(R.string.op111),context.getString(R.string.op16),context.getString(R.string.op12) ,3);//el entero es el numero de respuesta correcta
            p8 = new Pregunta(context.getString(R.string.Pregunta2), "https://media.discordapp.net/attachments/970748327568224289/978349551532535828/verde.png?width=937&height=655",context.getString(R.string.op111),context.getString(R.string.op19),context.getString(R.string.op11),context.getString(R.string.op15),1);//el entero es el numero de respuesta correcta
            p9 = new Pregunta(context.getString(R.string.Pregunta2), "https://media.discordapp.net/attachments/970748327568224289/978349549892546560/ama.jpg?width=1164&height=655",context.getString(R.string.op12),context.getString(R.string.op15),context.getString(R.string.op17),context.getString(R.string.op112),4);//el entero es el numero de respuesta correcta
            p10 = new Pregunta(context.getString(R.string.Pregunta2), "https://media.discordapp.net/attachments/970748327568224289/978349549330501702/rojo.jpg",context.getString(R.string.op110),context.getString(R.string.op13),context.getString(R.string.op17),context.getString(R.string.op114),2);//el entero es el numero de respuesta correcta
                break;
        case "biologia":
            p1 = new Pregunta(context.getString(R.string.p1),
                    //"https://educacion30.b-cdn.net/wp-content/uploads/2016/04/animales-destacada.jpg",
                    R.drawable.pregunta1,"gato", "lobo", "zorro", "perro", 2);

            p2 = new Pregunta(context.getString(R.string.p2),
                    R.drawable.pregunta2,//"https://cerebriti.b-cdn.net/uploads/151c90bf952722c92d2c234cc86ea72d.jpg",
                    "fungi", "plantas", "animalia", "protista", 4);

            p3 = new Pregunta(context.getString(R.string.p3),
                    R.drawable.pregunta3,//"https://www.diariodesevilla.es/2021/09/18/sociedad/saber-pitbull-puro_1612048824_143999970_1200x675.jpg",
                    "doberman", "pug", "pitbull", "boxer", 3);

            p4 = new Pregunta(context.getString(R.string.p4),
                    R.drawable.pregunta4, //"https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Rock_dove_-_natures_pics.jpg/1200px-Rock_dove_-_natures_pics.jpg",
                    "terrestre", "acuatico", "aereo", "a todos ellos", 3);

            p5 = new Pregunta(context.getString(R.string.p5),
                    R.drawable.pregunta5,//"https://t2.ev.ltmcdn.com/es/posts/5/4/5/_3545_1_600.jpg",
                    "megalodon", "elefante", "orca", "ballena azul", 4);
            p6 = new Pregunta(context.getString(R.string.p6),
                    R.drawable.pregunta6, // "https://www.caracteristicas.co/wp-content/uploads/2018/08/pulpo-1-e1578322412373.jpg",
                    "Pertenece al reino animalia", "Pertenece al reino plantae", "No", "Si", 3);
            p7 = new Pregunta(context.getString(R.string.p7),
                    R.drawable.pregunta7,//"https://us.123rf.com/450wm/aspi13/aspi131907/aspi13190700042/127824679-icono-de-h%C3%A9lice-de-adn.jpg?ver=6",
                    "Adentramiento celular", "Ácido desoxirribonucleico", "Adrenales glándulas", "Adenina", 2);
            p8 = new Pregunta(context.getString(R.string.p8),
                    R.drawable.pregunta8,//"https://cdn.slidesharecdn.com/ss_thumbnails/ecosistema-191013133412-thumbnail-4.jpg?cb=1570973718",
                    "El conjunto de seres vivos y su relación con el medio", "Un sistema ecológico", "Conjunto de ecos producidos por sonidos", "Un componente de PC", 1);
            p9 = new Pregunta(context.getString(R.string.p9),
                    R.drawable.pregunta9,// "https://cuadros-comparativos.com/wp-content/uploads/2019/10/animales-vertebrados-e-invertebrados-1024x576.jpg",
                    "Uno en su interior compuesto de huesos y espinas y el otro en su exterior, otro tipo de estructuras", "Son los mismos", "Uno pertenece al reino plantae y otro al protista", "Ninguna de las anteriores", 1);
            p10 = new Pregunta(context.getString(R.string.p10),
                    R.drawable.pregunta10, // "https://www.periodicoelgancho.com/wp-content/uploads/2015/04/noticia-huevo-peque%C3%B1o61.jpg",
                    "Gallina", "Canario", "Loro", "Colibri", 4);
            break;
        case "geografía":
            p1 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.cordoba,
                    context.getString(R.string.opcion1_1),
                    context.getString(R.string.opcion2_1),
                    context.getString(R.string.opcion3_1),
                    context.getString(R.string.opcion4_1),
                    1);

            p2 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.formosa,
                    context.getString(R.string.opcion1_2),
                    context.getString(R.string.opcion2_2),
                    context.getString(R.string.opcion3_2),
                    context.getString(R.string.opcion4_2),
                    1);

            p3 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.entrerios,
                    context.getString(R.string.opcion1_3),
                    context.getString(R.string.opcion2_3),
                    context.getString(R.string.opcion3_3),
                    context.getString(R.string.opcion4_3),
                    2);

            p4 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.corrientes,
                    context.getString(R.string.opcion1_4),
                    context.getString(R.string.opcion2_4),
                    context.getString(R.string.opcion3_4),
                    context.getString(R.string.opcion4_4),
                    1);

            p5 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.tucuman,
                    context.getString(R.string.opcion1_5),
                    context.getString(R.string.opcion2_5),
                    context.getString(R.string.opcion3_5),
                    context.getString(R.string.opcion4_5),
                    4);

            p6 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.sanluis,
                    context.getString(R.string.opcion1_6),
                    context.getString(R.string.opcion2_6),
                    context.getString(R.string.opcion3_6),
                    context.getString(R.string.opcion4_6),
                    2);

            p7 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.catamarca,
                    context.getString(R.string.opcion1_7),
                    context.getString(R.string.opcion2_7),
                    context.getString(R.string.opcion3_7),
                    context.getString(R.string.opcion4_7),
                    3);

            p8 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.misiones,
                    context.getString(R.string.opcion1_8),
                    context.getString(R.string.opcion2_8),
                    context.getString(R.string.opcion3_8),
                    context.getString(R.string.opcion4_8),
                    1);

            p9 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.formosa,
                    context.getString(R.string.opcion1_9),
                    context.getString(R.string.opcion2_9),
                    context.getString(R.string.opcion3_9),
                    context.getString(R.string.opcion4_9),
                    2);

            p10 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.jujuy,
                    context.getString(R.string.opcion1_10),
                    context.getString(R.string.opcion2_10),
                    context.getString(R.string.opcion3_10),
                    context.getString(R.string.opcion4_10),
                    4);

            p11 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.larioja,
                    context.getString(R.string.opcion1_11),
                    context.getString(R.string.opcion2_11),
                    context.getString(R.string.opcion3_11),
                    context.getString(R.string.opcion4_11),
                    1);

            p12 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.santiagodelestero,
                    context.getString(R.string.opcion1_12),
                    context.getString(R.string.opcion2_12),
                    context.getString(R.string.opcion3_12),
                    context.getString(R.string.opcion4_12),
                    3);

            p13 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.salta,
                    context.getString(R.string.opcion1_13),
                    context.getString(R.string.opcion2_13),
                    context.getString(R.string.opcion3_13),
                    context.getString(R.string.opcion4_13),
                    1);

            p14 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.buenosaires,
                    context.getString(R.string.opcion1_14),
                    context.getString(R.string.opcion2_14),
                    context.getString(R.string.opcion3_14),
                    context.getString(R.string.opcion4_14),
                    3);

            p15 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.rionegro,
                    context.getString(R.string.opcion1_15),
                    context.getString(R.string.opcion2_15),
                    context.getString(R.string.opcion3_15),
                    context.getString(R.string.opcion4_15),
                    4);

            p16 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.neuquen,
                    context.getString(R.string.opcion1_16),
                    context.getString(R.string.opcion2_16),
                    context.getString(R.string.opcion3_16),
                    context.getString(R.string.opcion4_16),
                    3);

            p17 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.chubut,
                    context.getString(R.string.opcion1_17),
                    context.getString(R.string.opcion2_17),
                    context.getString(R.string.opcion3_17),
                    context.getString(R.string.opcion4_17),
                    3);

            p18 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.sanluis,
                    context.getString(R.string.opcion1_18),
                    context.getString(R.string.opcion2_18),
                    context.getString(R.string.opcion3_18),
                    context.getString(R.string.opcion4_18),
                    1);

            p19 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.santacruz,
                    context.getString(R.string.opcion1_19),
                    context.getString(R.string.opcion2_19),
                    context.getString(R.string.opcion3_19),
                    context.getString(R.string.opcion4_19),
                    4);

            p20 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.lapampa,
                    context.getString(R.string.opcion1_20),
                    context.getString(R.string.opcion2_20),
                    context.getString(R.string.opcion3_20),
                    context.getString(R.string.opcion4_20),
                    1);

            p21 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.tierradelfuego,
                    context.getString(R.string.opcion1_21),
                    context.getString(R.string.opcion2_21),
                    context.getString(R.string.opcion3_21),
                    context.getString(R.string.opcion4_21),
                    4);

            p22 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.mendoza,
                    context.getString(R.string.opcion1_22),
                    context.getString(R.string.opcion2_22),
                    context.getString(R.string.opcion3_22),
                    context.getString(R.string.opcion4_22),
                    2);

            p23 = new Pregunta(context.getString(R.string.Pregunta),
                    R.drawable.buenosaires,
                    context.getString(R.string.opcion1_23),
                    context.getString(R.string.opcion2_23),
                    context.getString(R.string.opcion3_23),
                    context.getString(R.string.opcion4_23),
                    1);
            preguntas.add(p11);
            preguntas.add(p12);
            preguntas.add(p13);
            preguntas.add(p14);
            preguntas.add(p15);
            preguntas.add(p16);
            preguntas.add(p17);
            preguntas.add(p18);
            preguntas.add(p19);
            preguntas.add(p20);
            preguntas.add(p21);
            preguntas.add(p22);
            preguntas.add(p23);
    }




        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);



    }
}