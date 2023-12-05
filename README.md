# Zee's Trims

This fabric mod aims to implement some armor trims made by [SystemZee](https://www.youtube.com/@syszee), as well as his [Rainbow "Jeb" trims](https://youtu.be/MEwsfdl_zzk?t=1750&si=qBTxGidL4Jzsb392). No, I have not been given explicit permission to reuse a few assets, but the experimental mod's license was MIT, which states that I may "modify and redistribute the software".

## Planned Features
- [x] "Jeb" armor trims (rainbow shader)
- [ ] Compatibility pack for Bare Bones
- [ ] Add echo shard as trimmable material
- [ ] Add custom trims (frost, shaft, dive, villager)

## FAQs

### Who gave you permission to make this?
I have not been given explicit permission to reuse a lot of his assets, but the experimental mod's license was MIT, which states that I may "modify and redistribute the software".

### I'm using Iris shaders - why is my armor pink?
This is due to the fact that this mod uses core shaders, and iris overwrites this. Every armor trim material has a "color palette", and since these custom trims make use of shaders, it uses a solid colour for the palette. If you really want to fix this, perhaps try using optifabric as an alternative (although in my experience there are a lot of compatability issues)

### Will you port this mod to [version]?
When a new version of minecraft releases, I will port it when I have the time to do so, for backports, however, unless I see an extremely high demand for a past version, I will not be porting it to older versions no one uses, and it requires a lot of effort to migrate the code between versions, as I then have to maintain those versions too.

### Can you port it to another modloader?
Neoforge: Definitely not, for the reason outlined below. No compromises.
Forge: Probably not, due to the terrible usability of the forge ecosystem, but here's hoping.
Quilt: It's a fabric mod, I've tested and run it on quilt, and so can you :D
