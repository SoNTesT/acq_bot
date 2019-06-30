package scr;

class Trunc1 {
    Httpreq req = new Httpreq();
    Runnable runs = () -> {
        try {
            req.httppost("Первый транзакционный реестр пришел?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };}