package EJ3_SOBRESCRITURA;

public class CursoTeorico extends Curso {
    private String materialTeorico;

    public CursoTeorico(String nombreCurso, int duracion, String materialTeorico) {
        super(nombreCurso, duracion);
        this.materialTeorico = materialTeorico;
    }

    public String getMaterialTeorico() {
        return materialTeorico;
    }

    public void setMaterialTeorico(String materialTeorico) {
        this.materialTeorico = materialTeorico;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Material teorico: " + materialTeorico);
    }

    static class CursoPrimeraAyudaT extends CursoTeorico {
        private String kitEmergencia;

        public CursoPrimeraAyudaT (String nombreCurso, int duracion, String materialTeorico, String kitEmergencia) {
            super(nombreCurso, duracion, materialTeorico);
            this.kitEmergencia = kitEmergencia;
        }

        public String getKitEmergencia() {
            return kitEmergencia;
        }

        public void setKitEmergencia(String kitEmergencia) {
            this.kitEmergencia = kitEmergencia;
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Kit emergencia: " + kitEmergencia);
        }
    }

    public static class CursoNatacionBasicaT extends CursoTeorico{
        private int flotadores;

        public CursoNatacionBasicaT (String nombreCurso, int duracion, String materialTeorico,int flotadores) {
            super(nombreCurso, duracion, materialTeorico);
            this.flotadores = flotadores;
        }

        public int getFlotadores() {
            return flotadores;
        }

        public void setFlotadores(int flotadores) {
            this.flotadores = flotadores;
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Flotadores: " + flotadores);
        }
    }

    public static class CursoNatacionAvanzadaT extends CursoTeorico{
        private String competencias;

        public CursoNatacionAvanzadaT (String nombreCurso, int duracion, String materialTeorico,String competencias) {
            super(nombreCurso, duracion, materialTeorico);
            this.competencias = competencias;
        }

        public String getCompetencias() {
            return competencias;
        }

        public void setCompetencias(String competencias) {
            this.competencias = competencias;
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Competencias: " + competencias);
        }
    }

}
