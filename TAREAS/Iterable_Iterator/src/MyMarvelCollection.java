import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyMarvelCollection implements Iterable<Film> {
    private Film[] films;
    private int numFilms;


 /** Este constructor inicializa la colección de películas "films" de la instancia actual con
    el arreglo de películas que se pasa como parámetro y establece el número de
    películas "numFilms" en cero, ya que todavía no se han agregado películas a la colección.*/
    public MyMarvelCollection(Film[] films) {
        this.films = films;
        this.numFilms = 0;
    }


/**  El método primero verifica si la colección está llena comparando el número de películas "numFilms"
    con la longitud del arreglo "films". Si estos valores son iguales, significa que la colección está
    llena y se imprime un mensaje en la consola indicando que la colección está llena. Luego, el método
    retorna sin agregar la película a la colección.*/
/**  En resumen, este método agrega una película a la colección si la colección no está llena, y muestra
    un mensaje de error si la colección ya está llena.*/
    public void add(Film film) {
        if (numFilms == films.length) {
            System.out.println("La colección está llena.");
            return;
        }

        films[numFilms] = film;
        numFilms++;
    }

/**  El objeto "FilmIterator" se utiliza para recorrer los elementos de la colección y proporciona métodos
    como "hasNext()" y "next()" para iterar sobre los elementos. Al llamar al método "iterator()", se
    crea un nuevo objeto "FilmIterator" y se devuelve como un iterador para la colección.*/
    @Override
    public Iterator<Film> iterator() {
        return new FilmIterator();
    }



/**  Esta clase implementa un iterador que permite recorrer una colección de películas representada por un
    arreglo de manera secuencial, verificando si hay más elementos disponibles y permitiendo acceder al
    siguiente elemento en la colección.*/
    private class FilmIterator implements Iterator<Film> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < numFilms;
        }

        @Override
        public Film next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return films[index++];
        }
    }
}

