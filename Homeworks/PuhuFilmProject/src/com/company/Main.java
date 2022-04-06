package com.company;

public class Main {

    public static void main(String[] args) {

        App app = new App();

        Film film1 = new Film (
                1,
                "Gökdelen",
                "https://img-puhutv.mncdn.com/media/img/320x224/22-01/31/high-risetitle_10x7.jpg",
                2015,
                "Ben Wheatley",
                "1970´lerin distopya havasını yansıtan bilim kurgu filmde, dünyadan soyutlanmış bir gökdelende lüks bir yaşam süren genç bir doktorun yaşadıklarını konu alıyor."
        );

        Film film2 = new Film(
                2,
                "Kör Talihim",
                "https://img-puhutv.mncdn.com/media/img/320x224/22-01/31/my-blind-date-with-lifetitle_10x7.jpg",
                2017,
                "Marc Rothemund",
                "Almanya’nın \"Can Dostum\"u olarak anılan film, inanilmaz bir gerçek hikayeden uyarlama… Hırslı bir adam olan Saliya’nın, gençliğinden beri en büyük hayali lüks bir otelde çalışmaktır."
        );

        Film film3 = new Film(
                3,
                "Yaz",
                "https://img-puhutv.mncdn.com/media/img/320x224/22-01/31/letotitle_10x7.jpg",
                2018,
                "Kirill Serebrennikov",
                "Cannes Film Festivali’nde Altın Palmiye için yarışan LETO, 1980’ler Leningrad’ında bir yaz günü başlıyor ve Sovyetler Birliği’nde rock’n’roll’un kaderini değiştiren kahramanları mercek altına alıyor."
        );

        app.addToFilms(film1);
        app.addToFilms(film2);
        app.addToFilms(film3);

        app.addToCart(film2);

        app.printAllFilms();
        // app.printAllFilmsInCart();

    }
}
