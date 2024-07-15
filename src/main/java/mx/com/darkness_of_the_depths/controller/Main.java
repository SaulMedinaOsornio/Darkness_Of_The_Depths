package mx.com.darkness_of_the_depths.controller;

import mx.com.darkness_of_the_depths.controller.models.Band;
import mx.com.darkness_of_the_depths.controller.models.Disc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Disc> discs = new ArrayList<>();

        discs.add(new Disc(
                "Burzum",
                "1992",
                "Black Metal",
                new Band("Burzum"),
                20.65,
                "https://www.burzum.org/img/covers/small/official/1992_burzum.jpg"
        ));

        discs.add(new Disc(
                "De Mysteriis Dom Sathanas",
                "1994",
                "Black Metal",
                new Band("Mayhem"),
                4.90,
                "https://www.emp.de/dw/image/v2/BBQV_PRD/on/demandware.static/-/Sites-master-emp/default/dw2cfdcd92/images/4/4/5/2/445252a.jpg?sfrm=png"
        ));

        discs.add(new Disc(
                "Litourgiya",
                "2015",
                "Black Metal",
                new Band("Batushka"),
                3.60,
                "https://akamai.sscdn.co/uploadfile/letras/albuns/e/8/9/c/596871505758367.jpg"
        ));

        discs.add(new Disc(
                "Noregs Vaapen",
                "2011",
                "Black Metal",
                new Band("Taake"),
                7.99,
                "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiMXT9a0zQd5A2YykIyIYVNgsAn261-I_oqRH_sYCP5wvT83rAWuaxqCwV__SV1l0nQT_KL9KeoXx0Qgju2k9jqJCK7Egd8FJQztDQDgulo5d8MYqJFMuTyVaGnjuldJVhsTQ6y6EkV5BaG/s1600/Taake+-+Noregs+vaapen.jpg"
        ));

        discs.add(new Disc(
                "Den Vrede Makt",
                "2024",
                "Black Metal",
                new Band("Whoredom Rife"),
                3.90,
                "https://f4.bcbits.com/img/a2315867569_16.jpg"
        ));

        discs.add(new Disc(
                "Enthrone Darkness Triumphant",
                "1997",
                "Black Metal",
                new Band("Dimmu Borgir"),
                15.95,
                "https://f4.bcbits.com/img/a0414720920_16.jpg"
        ));

        discs.add(new Disc(
                "Desert Nothern Hell",
                "2004",
                "Black Metal",
                new Band("Tsjuder"),
                7.20,
                "https://f4.bcbits.com/img/a1329159159_16.jpg"
        ));

        discs.add(new Disc(
                "Dark Medieval Times",
                "2021",
                "Black Metal",
                new Band("Satyricon"),
                12.20,
                "https://f4.bcbits.com/img/a1679786338_16.jpg"
        ));

        discs.add(new Disc(
                "U.S.T",
                "2021",
                "Depressive Black Metal",
                new Band("Darkness of the depths"),
                47.20,
                "https://scontent.fmex1-6.fna.fbcdn.net/v/t39.30808-6/449315396_868122978669312_2158587117582443108_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeGdSnS5EapNJTGQ_d6_Q7AxWt7mrYUmXo5a3uathSZejryjeUupoSE5JxuDHBqnJVM7NPkjgJhrk9KNHC03hao3&_nc_ohc=45YaSup-Hi0Q7kNvgEh6TS6&_nc_ht=scontent.fmex1-6.fna&oh=00_AYAwLED16muRXlCv95DL93FeaGC2tUjUnnC-NjQ5rGOESQ&oe=6687B4E1"
        ));

        discs.add(new Disc(
                "Lawless Darknesss",
                "2010",
                "Black Metal",
                new Band("Watain"),
                12.20,
                "https://upload.wikimedia.org/wikipedia/en/2/2b/Lawless_Darkness_cover.jpg"
        ));

        discs.add(new Disc(
                "Untitled",
                "2024",
                "Depressive Black Metal",
                new Band("Made Of Pain"),
                15.20,
                "https://i.ytimg.com/vi/jzic9Tq0-ls/sddefault.jpg?sqp=-oaymwEmCIAFEOAD8quKqQMa8AEB-AG2BYACiAOKAgwIABABGGEgYShhMA8=&rs=AOn4CLCgfvmOD73gy0ktMNUwis6smcekBQ"
        ));

        discs.add(new Disc(
                "God Of The Thorms",
                "2019",
                "Black Metal",
                new Band("Uranygore"),
                28.20,
                "https://scontent.fmex1-5.fna.fbcdn.net/v/t39.30808-6/449538896_868122938669316_7720803077171709320_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeETAo9Hg4lrSdbr0RSEMoYruT3AmgYGa6S5PcCaBgZrpJ3XLXl6BCD2pfnC8f6Kgr8jNGOEw8E4QHVEGoMkBHCC&_nc_ohc=pxt58D85sLAQ7kNvgG7-5Si&_nc_ht=scontent.fmex1-5.fna&oh=00_AYALniQ7uNv2JPOVxhULLXJI3UPhQqfgHkwgbyrNOkqqTQ&oe=66878955"
        ));

        Main main = new Main();
        System.out.println(main.formatToHTML(discs));
    }

    private String formatToHTML(List<Disc> discs) {
        StringBuilder element = new StringBuilder();
        for (Disc disc : discs) {
            element.append("<div><img src = ").append(disc.getUrlImage()).append(" alt = \"digital disc image\"/>");
            element.append("<p> Name: ").append(disc.getName()).append("</p>");
            element.append("<p> Band: ").append(disc.getBand()).append(" </p>");
            element.append("<p> Genre: ").append(disc.getGenre()).append(" </p>");
            element.append("<p> Year: ").append(disc.getLunchDate()).append(" </p>");
            element.append("<p> Price: ").append(disc.getPrice()).append(" USD <button> + </button ></p>");
            element.append("</div>\n");
        }
        return element.toString();
    }
}
