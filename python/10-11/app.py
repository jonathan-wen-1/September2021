from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "<p>Hello, World!</p>"

@app.route("/Tester")
def test():
    return "<p>This is a different location!</p>"

@app.route("/name")
def name():
    return "<p>This is jon</p>"
if __name__ == "__main__":
    app.run(debug=True)