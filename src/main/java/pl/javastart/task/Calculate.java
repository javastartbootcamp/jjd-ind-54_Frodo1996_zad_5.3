package pl.javastart.task;

class Calculate {
    double priceGross;

    public double grossCalculating(Product product) {
        priceGross = 0;
        switch (product.getCategory()) {
            case "vegetables" -> priceGross = product.getPriceNet() * 1.40;
            case "fruits" -> priceGross = product.getPriceNet() * 1.20;
            default -> priceGross = product.getPriceNet() * 1.10;
        }
        return priceGross;
    }
}