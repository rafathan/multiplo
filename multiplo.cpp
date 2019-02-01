#include <cstdlib>
#include <iostream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b;
    char respuesta = '1';
    bool error = false;

    while (respuesta == '1') {
        cout << "\nDame una cifra: ";
        cin >> a;
        cout << "Dame otra cifra y te dire si " << a << " es multiplo de ella: ";
        cin >> b;

        if (a % b == 0) cout << a << " es multiplo de " << b;
        else cout << a << " no es multiplo de " << b;

        cout << "\n\n1-Realizar nueva comprobacion.\n0-Salir.\n";
        do {
            error = false;
            cout << "Seleccion: ";
            cin >> respuesta;
            if ((respuesta != '0') && (respuesta != '1')) {
                cout << "Opcion incorrecta.\n";
                        error = true;
            }
        } while (error);
    }

    return 0;
}
