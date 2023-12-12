package br.com.jhonatanchaves.comercial_app;

import br.com.jhonatanchaves.comercial_app.model.UsuarioModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       UsuarioModel usuario1 = new UsuarioModel("jhonatan chaves silva", "123.456.789.12", "06/06/1998", null, null, null, 306439, "programador", "R$ 1.590,33");
       
       usuario1.dadosCompletos();
    }
}
