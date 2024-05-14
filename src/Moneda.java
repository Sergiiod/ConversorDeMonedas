public record Moneda(String base_code, String target_code, double conversion_result) {
    public double conversion_result() {
        return conversion_result;
    }

    public String base_code() {
        return "[" + base_code + "]";
    }
    public String target_code(){
        return "["+ target_code + "]";

    }
}
