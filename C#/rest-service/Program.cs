var builder = WebApplication.CreateBuilder(args);

// Lista Default
AllGames.listGames = new List<Games>() {
    new Games("Atari", "Atari", "1983"), 
    new Games("NES", "Nintendo", "1983"), 
    new Games("Master System", "Sega", "1987"), 
    new Games("Game Boy", "Nintendo", "1989"), 
    new Games("Mega Drive", "Sega", "1988"), 
    new Games("Super Nintendo", "Nintendo", "1990"), 
    new Games("Playstation", "Sony", "1994"), 
    new Games("Nintendo 64", "Nintendo", "1996")
};

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();
