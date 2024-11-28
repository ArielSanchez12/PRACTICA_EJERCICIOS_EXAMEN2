package EJ3_SOBRESCRITURA;

public class Main {
    public static void main (String[] args){


        Curso curso = new Curso();
        String nombreC = "Hola";
        curso.setNombreCurso(nombreC);
        CursoTeorico cursoTeorico = new CursoTeorico(curso.getNombreCurso(), curso.getDuracion(), "pdf");
        String materialT = "pdf2";
        cursoTeorico.setMaterialTeorico(materialT);
        CursoTeorico.CursoPrimeraAyudaT pe = new CursoTeorico.CursoPrimeraAyudaT(curso.getNombreCurso(), curso.getDuracion(), cursoTeorico.getMaterialTeorico(), "no");
        pe.mostrarDetalles();

    }
}
