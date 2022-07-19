void staircase(int n) {
for (int i = 0; i<n; i++)
{
    for(int j = 0; j < (n-1) - i; j++)
        cout<<" ";
    
    for(int j = 0; j <= i; j++)
        cout<<"#";
    cout<<endl;
}
}