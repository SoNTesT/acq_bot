class Trunc2 {
    Httpreq req = new Httpreq();
    Runnable runs = () -> {
        try {
            req.httppost("Первый транзакционный реестр пришел?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}