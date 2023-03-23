package org.example.EnumImplementsInterface;

public enum Day implements week{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public int day()
    {
        return ordinal() + 1;
    }
}
