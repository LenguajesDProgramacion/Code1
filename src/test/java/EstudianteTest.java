import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {
    @Test
    public void estudainte(){
        Estudiante estudiante = new Estudiante( "Tania","Lopez", 789878, 28);
        Materia materia1 = new Materia("Ingles", "123A", 55, 51);
        Materia materia2 = new Materia("Lenguaje", "123B", 98, 51);
        Materia materia3 = new Materia("Fisica", "123C", 87,51);
        Materia materia4 = new Materia("Quimica","123D", 44,51);
        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        m.add(materia3);
        m.add(materia4);
        //System.out.println(estudiante.getMateria("123C",m));
        System.out.println("La nota minima es: "+materia3.Min(m));
    }

}