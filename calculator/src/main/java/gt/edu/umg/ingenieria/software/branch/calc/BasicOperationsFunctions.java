/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.software.branch.calc;

/**
 *
 * @author lizardo
 */
public class BasicOperationsFunctions implements BasicOperations{

    @Override
    public int sumar(int sumando1, int sumando2) {
        int suma=0;
        
        suma = sumando1 + sumando2;
        
        return suma;
    }

    @Override
    public long sumar(long sumando1, long sumando2) {
        long suma=0;
        
        suma = sumando1 + sumando2;
        
        return suma;
    }

    @Override
    public float sumar(float sumando1, float sumando2) {
        float suma=0;
        
        suma = sumando1 + sumando2;
        
        return suma;
    }

    @Override
    public double sumar(double sumando1, double sumando2) {
        double suma=0;
        
        suma = sumando1 + sumando2;
        
        return suma;
    }

    @Override
    public int restar(int minuendo, int sustraendo) {
        int resta=0;
        
        resta = minuendo - sustraendo;
        
        return resta;
    }

    @Override
    public long restar(long minuendo, long sustraendo) {
        long resta=0;
        
        resta = minuendo - sustraendo;
        
        return resta;
    }

    @Override
    public float restar(float minuendo, float sustraendo) {
        float resta=0;
        
        resta = minuendo - sustraendo;
        
        return resta;
    }

    @Override
    public double restar(double minuendo, double sustraendo) {
        double resta=0;
        
        resta = minuendo - sustraendo;
        
        return resta;
    }

    @Override
    public int multiplicar(int multiplicando, int multiplicador) {
        int multi=0;
        
        multi = multiplicando * multiplicador;
        
        return multi;
    }

    @Override
    public long multiplicar(long multiplicando, long multiplicador) {
        long multi=0;
        
        multi = multiplicando * multiplicador;
        
        return multi;
    }

    @Override
    public float multiplicar(float multiplicando, float multiplicador) {
        float multi=0;
        
        multi = multiplicando * multiplicador;
        
        return multi;
    }

    @Override
    public double multiplicar(double multiplicando, double multiplicador) {
        double multi=0;
        
        multi = multiplicando * multiplicador;
        
        return multi;
    }

    @Override
    public int dividir(int dividendo, int divisor) throws Exception {
        int division=0;
        
        division = dividendo / divisor;
        
        return division;
    }

    @Override
    public long dividir(long dividendo, long divisor) throws Exception {
        long division=0;
        
        division = dividendo / divisor;
        
        return division;
    }

    @Override
    public float dividir(float dividendo, float divisor) throws Exception {
        float division=0;
        
        division = dividendo / divisor;
        
        return division;
    }

    @Override
    public double dividir(double dividendo, double divisor) throws Exception {
        double division=0;
        
        division = dividendo / divisor;
        
        return division;
    }
    
}
