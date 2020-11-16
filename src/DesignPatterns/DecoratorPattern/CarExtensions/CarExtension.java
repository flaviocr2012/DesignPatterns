package DesignPatterns.DecoratorPattern.CarExtensions;

public interface CarExtension  {
    public String getDescription();
    public int getCost();



}

    /** O Decorator é mais utilizado quando quisermos adicionar responsabilidades a objetos dinamicamente,
     *     e quando a extensão por subclasses é impraticável, pois teríamos muitas alterações
     *     e dessa forma diversas subclasses.
      */


