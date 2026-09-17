package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txt_pseudonimo;
    private String rad_genero;
    private String sel_suscipcion;
    private String fechaNacimiento;
    private String chk_terminos;
    private String comentarios;

    public Usuario() {
    }

    public Usuario(String chk_terminos, String comentarios, String fechaNacimiento, String sel_suscipcion, String rad_genero, String txt_pseudonimo, String correo, String contrasenia, String nombre) {
        this.chk_terminos = chk_terminos;
        this.comentarios = comentarios;
        this.fechaNacimiento = fechaNacimiento;
        this.sel_suscipcion = sel_suscipcion;
        this.rad_genero = rad_genero;
        this.txt_pseudonimo = txt_pseudonimo;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSel_suscipcion() {
        return sel_suscipcion;
    }

    public void setSel_suscipcion(String sel_suscipcion) {
        this.sel_suscipcion = sel_suscipcion;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
