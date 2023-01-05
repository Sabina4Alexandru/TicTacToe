import tkinter as tk
class TicTacToeFrame():
    def __init__(self,parent):
        self.frame= tk.Frame(parent,height=800,width=800,bg='red')
        
        for x in range(1, 4):
            for y in range(1, 4):
                XOPoint(x, y,self.frame)
                
        self.frame.pack()
class XOPoint:  
    def __init__(self, x, y,    frame):  
        self.x = x  
        self.y = y  
        self.value = None  
        self.button = tk.Button(frame, text="", width=10, height=5)  
        self.button.grid(row=x, column=y)  
  
    def reset(self):  
        self.button.configure(text="", bg='white')  
        self.value = None  

top=tk.Tk()

top.title("Tic Tac Toe")
tk.Label(top, text="Tic Tac Toe", font=('Ariel', 25)).pack()  

TicTacToeFrame(top)
  

top.mainloop()