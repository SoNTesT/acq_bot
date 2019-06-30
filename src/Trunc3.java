class Trunc3 {
    Httpreq req = new Httpreq();
    Runnable runs = () -> {
        try {
            req.httppost("Третий транзакционный реестр пришел?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}