package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.dto.PersonaDto;

public class PersonasUtilidades {
    public static final int TIPO_ADMIN = 1;
    public static final int TIPO_EMPLEADO = 2;
    private static int bandera = 0;

    public static List<PersonaDto> listaPersonas = new ArrayList<>();

    public static void iniciarLista() {
        if (bandera == 0) {
            listaPersonas.add(new PersonaDto("admin", "Administrador", "NA", 0, "NA", "admin", TIPO_ADMIN));
            listaPersonas.add(new PersonaDto("111", "Cristian David Henao", "345345", 33, "Ingeniero", "111", TIPO_ADMIN));
            listaPersonas.add(new PersonaDto("222", "Juan Martin Orozco", "2342342", 21, "Estudiante", "222", TIPO_EMPLEADO));
            bandera = 1;
        }
    }
}
