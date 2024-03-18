package org.example;

public class Book {
    private static int counter;
    private int id;
    private String title;
    private String authorName;
    private String usedLanguage;
    private Type bookType;
    private int quantity;
    private double price;


    public enum Type {
        Horror,
        Educational,
        MYSTERY,
        SCIENCE_FICTION,
        HISTORY,
    }

    public Book() {
    }

    public Book(String title, String authorName, String usedLanguage, Type bookType, int quantity, double price) {
        id=++   counter;
        this.title = title;
        this.authorName = authorName;
        this.usedLanguage = usedLanguage;
        this.bookType = bookType;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public String getUsedLanguage()
    {
        return usedLanguage;
    }

    public void setUsedLanguage(String usedLanguage)
    {
        this.usedLanguage = usedLanguage;
    }

    public Type getBookType()
    {
        return bookType;
    }

    public void setBookType(Type bookType)
    {
        this.bookType = bookType;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
