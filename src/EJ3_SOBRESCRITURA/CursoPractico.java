package EJ3_SOBRESCRITURA;

public class CursoPractico extends Curso{
    private String equipoPractico;

    public CursoPractico(String nombreCurso, int duracion,String equipoPractico) {
        super(nombreCurso, duracion);
        this.equipoPractico = equipoPractico;
    }

    public String getEquipoPractico() {
        return equipoPractico;
    }

    public void setEquipoPractico(String equipoPractico) {
        this.equipoPractico = equipoPractico;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Equipo Practico: " + equipoPractico);

    }

    static class CursoPrimeraAyudaP extends CursoPractico {
        private String kitEmergencia;

        public CursoPrimeraAyudaP (String nombreCurso, int duracion, String materialTeorico, String kitEmergencia) {
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

    public static class CursoNatacionBasicaP extends CursoPractico{
        private int flotadores;

        public CursoNatacionBasicaP (String nombreCurso, int duracion, String materialTeorico,int flotadores) {
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

    public static class CursoNatacionAvanzadaP extends CursoPractico{
        private String competencias;

        public CursoNatacionAvanzadaP (String nombreCurso, int duracion, String materialTeorico,String competencias) {
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
