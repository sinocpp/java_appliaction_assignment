package Currency;

// Base class that provide property interface for currency data manipulation

public class Currency {
    private BaseEntity currencyNum;
    private BaseEntity date;
    private BaseEntity state;
    private BaseEntity currencyCode;
    private BaseEntity currencyShort;
    private BaseEntity unit;
    private BaseEntity currencyForBuy;
    private BaseEntity middleForCurrency;
    private BaseEntity sellForCurrency;

    public BaseEntity getState() {
        return state;
    }
    public void setState(BaseEntity state) {
        this.state = state;
    }
    public BaseEntity getCurrencyCode() {
        return currencyCode;
    }
    public BaseEntity getCurrencyForBuy() {
        return currencyForBuy;
    }
    public BaseEntity getCurrencyNum() {
        return currencyNum;
    }
    public BaseEntity getCurrencyShort() {
        return currencyShort;
    }
    public BaseEntity getDate() {
        return date;
    }
    public BaseEntity getMiddleForCurrency() {
        return middleForCurrency;
    }
    public BaseEntity getSellForCurrency() {
        return sellForCurrency;
    }
    public BaseEntity getUnit() {
        return unit;
    }
    public void setCurrencyCode(BaseEntity currencyCode) {
        this.currencyCode = currencyCode;
    }
    public void setCurrencyForBuy(BaseEntity currencyForBuy) {
        this.currencyForBuy = currencyForBuy;
    }
    public void setCurrencyNum(BaseEntity currencyNum) {
        this.currencyNum = currencyNum;
    }
    public void setCurrencyShort(BaseEntity currencyShort) {
        this.currencyShort = currencyShort;
    }
    public void setDate(BaseEntity date) {
        this.date = date;
    }
    public void setMiddleForCurrency(BaseEntity middleForCurrency) {
        this.middleForCurrency = middleForCurrency;
    }
    public void setSellForCurrency(BaseEntity sellForCurrency) {
        this.sellForCurrency = sellForCurrency;
    }
    public void setUnit(BaseEntity unit) {
        this.unit = unit;
        this.unit.value = unit.longValue.toString();
    }

    // Abstract override for console output
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.getCurrencyNum().key + " : " + this.getCurrencyNum().value + "\n");
        stringBuilder.append(this.getDate().key + " : " + this.getDate().value + "\n");
        stringBuilder.append(this.getState().key + " : " + this.getState().value + "\n");
        stringBuilder.append(this.getCurrencyCode().key + " : " + this.getCurrencyCode().value + "\n");
        stringBuilder.append(this.getUnit().key + " : " + this.getUnit().value + "\n");
        stringBuilder.append(this.getCurrencyForBuy().key + " : " + this.getCurrencyForBuy().value + "\n");
        stringBuilder.append(this.getMiddleForCurrency().key + " : " + this.getMiddleForCurrency().value + "\n");
        stringBuilder.append(this.getSellForCurrency().key + " : " + this.getSellForCurrency().value + "\n");

        return stringBuilder.toString();
    }
}
