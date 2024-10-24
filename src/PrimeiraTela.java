import java.util.ArrayList;
import java.util.List;



// lista dinamica que nao tem valores físicos
public class PrimeiraTela {

    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new ArrayList<>();

        for (int u = 0; u < 5; u++) {

            Usuario usuario = new Usuario("Nome " + u, "Sobrenome " + u);
            listaUsuarios.add(usuario);
        }

            Usuario usuario5 = new Usuario("Nome 5", "Sobrenome 5");
            listaUsuarios.add(usuario5);

            Usuario usuario6 = new Usuario("Nome 6", "Sobrenome 6");
            listaUsuarios.add(usuario6);
            //listaUsuarios.remove(usuario6);
            //listaUsuarios.remove(usuario5);



        System.out.println(listaUsuarios.get(5).getNome());
            System.out.println(listaUsuarios.get(5).getSobrenome());

    }

}

