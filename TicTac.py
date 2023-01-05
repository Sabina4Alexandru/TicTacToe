import tkinter as tk
class TicTacToeFrame():
    def __init__(self,parent):
        self.frame= tk.Frame(parent,height=800)
        self.frame.pack()

    


top=tk.Tk()
frame =TicTacToeFrame(top)

top.mainloop()