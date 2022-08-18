package org.quick;

public class ShopBill 
{
    private int serialNo;
    private String companyId;
    private String customerName;
    private String contactNo;
    private String date;
    private String productName;
    private String productQuantity;
    private String productPrice;
    private String warranty;
    private String tax;
    private String total;
    private String status;

    public ShopBill(String companyId, String customerName, String contactNo, String date, String productName, String productQuantity, String productPrice, String warranty, String tax, String total, String status) {

        this.companyId = companyId;
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.date = date;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.warranty = warranty;
        this.tax = tax;
        this.total = total;
        this.status = status;
    }

    

    public ShopBill() {
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
