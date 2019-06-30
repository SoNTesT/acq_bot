class Trunc2 {
    Httpreq req = new Httpreq();
    Runnable runs = () -> {
        try {
            req.httppost("Второй транзакционный реестр пришел?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };}