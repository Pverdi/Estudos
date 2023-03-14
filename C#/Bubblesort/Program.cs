static void Troca(double[] vetor, int i, int j)
{

//este procedimento troca valores no vetor

    double aux = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = aux;

}
//O metodo bubblesort se dá pela comparação de pares que serão trocados se estiverem fora de ordem
//Ele compara se a posição i e a posição i + 1 estão ordenadas, e esse processo é repetido até que nenhuma troca seja feita
//É mais comum a ordenação de menores para maiores

static void BubbleSort(double[] vetor)
{
    int fim = vetor.Length - 1, pos = 0;
    bool troca = true; //inicializada como true para que o primeiro teste se inicie
    while(troca)
    {
        troca = false; // é passada para false e só rece true se ao menos um par de elementos nao estiverem ordenados
        for (int i = 0; i < fim; i++) //essa condição garante que eles serão ordenados em forma crescente
            if(vetor[i] > vetor[i + 1])
            {
                Troca(vetor, i, i + 1);
                pos = i;
                troca = true;
            }
        fim = pos - 1;
        
    }
}
static void Main(string[] args)
{
    var vet = new double[] {1.4, 2.3, 0, 7.8, 3.1};

    BubbleSort(vet);

    Console.ReadKey();
}