package ru.docophila;

public class Ok {
    public static String TEMPLATE= "<!DOCTYPE html>\n" +
            "<html >\n" +
            "<head>\n" +
            "  <!-- Site made with Mobirise Website Builder v4.7.2, https://mobirise.com -->\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "  <meta name=\"generator\" content=\"Mobirise v4.7.2, mobirise.com\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1\">\n" +
            "  <link rel=\"shortcut icon\" href=\"assets/images/fly-128x105.png\" type=\"image/x-icon\">\n" +
            "  <meta name=\"description\" content=\"\">\n" +
            "  <title>docophila</title>\n" +
            "  <link rel=\"stylesheet\" href=\"assets/web/assets/mobirise-icons/mobirise-icons.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/tether/tether.min.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-grid.min.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-reboot.min.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/socicon/css/styles.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/dropdown/css/style.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"assets/mobirise/css/mbr-additional.css\" type=\"text/css\">\n" +
            "  \n" +
            "  \n" +
            "  \n" +
            "</head>\n" +
            "<body>\n" +
            "  <section class=\"menu cid-qSGMUW7wk9\" once=\"menu\" id=\"menu2-k\">\n" +
            "\n" +
            "    \n" +
            "\n" +
            "    <nav class=\"navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm\">\n" +
            "        <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
            "            <div class=\"hamburger\">\n" +
            "                <span></span>\n" +
            "                <span></span>\n" +
            "                <span></span>\n" +
            "                <span></span>\n" +
            "            </div>\n" +
            "        </button>\n" +
            "        <div class=\"menu-logo\">\n" +
            "            <div class=\"navbar-brand\">\n" +
            "                <span class=\"navbar-logo\">\n" +
            "                    \n" +
            "                        <img src=\"assets/images/ico-122x93.png\" alt=\"Mobirise\" title=\"\" style=\"height: 6.5rem;\">\n" +
            "                    \n" +
            "                </span>\n" +
            "                <span class=\"navbar-caption-wrap\"><a class=\"navbar-caption text-black display-4\" href=\"http://docophila.ru\">\n" +
            "                        Docophila</a></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
            "            \n" +
            "            <div class=\"navbar-buttons mbr-section-btn\"><a class=\"btn btn-sm btn-primary display-4\" href=\"offer.pdf\">Предложение</a><a class=\"btn btn-sm btn-primary display-4\" href=\"/upload.html\">Демонстрация</a><a class=\"btn btn-sm btn-primary display-4\" href=\"tel:+1-234-567-8901\"><span class=\"mbri-letter mbr-iconfont mbr-iconfont-btn\"></span>\n" +
            "                    \n" +
            "                    IAYukhnovskiy.SBT@sberbank.ru &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a> <a class=\"btn btn-sm btn-primary display-4\" href=\"tel:+1-234-567-8901\">\n" +
            "                    <span class=\"btn-icon mbri-mobile mbr-iconfont mbr-iconfont-btn\">\n" +
            "                    </span>\n" +
            "                    +7-902-780-0807 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>\n" +
            "        </div>\n" +
            "    </nav>\n" +
            "</section>\n" +
            "\n" +
            "<section class=\"engine\"><a href=\"https://mobirise.me/u\">bootstrap website templates</a></section><section class=\"header9 cid-qSGpdKxe6j mbr-parallax-background\" id=\"header9-h\">\n" +
            "\n" +
            "    \n" +
            "\n" +
            "    \n" +
            "\n" +
            "    <div class=\"container\">\n" +
            "        <div class=\"media-container-column mbr-white col-md-8\">\n" +
            "            <h1 class=\"mbr-section-title align-left mbr-bold pb-3 mbr-fonts-style display-1\">\n" +
            "                Docophila</h1>\n" +
            "            <h3 class=\"mbr-section-subtitle align-left mbr-light pb-3 mbr-fonts-style display-2\">Робот для обработки рукописных\n" +
            "<div>неструктурированных документов.</div></h3>\n" +
            "            <p class=\"mbr-text align-left pb-3 mbr-fonts-style display-5\">Данные будут доступны в формате <a href='/%s.json'>json</a> через 5-25 сек. <br>" +
            "Время зависит от скорости загрузки документа на сервер.</p>" +

            "        </div>\n" +
            "    </div>\n" +
            "\n" +
            "    \n" +
            "</section>";

    public static String getPage(String msg){
        return String.format(TEMPLATE, msg);
    }

}

