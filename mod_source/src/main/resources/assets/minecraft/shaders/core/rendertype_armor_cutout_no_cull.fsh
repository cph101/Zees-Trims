#version 150

#moj_import <fog.glsl>
#moj_import <spheya_utils.glsl>

uniform sampler2D Sampler0;

uniform vec4 ColorModulator;
uniform float FogStart;
uniform float FogEnd;
uniform vec4 FogColor;
uniform float GameTime;

in float vertexDistance;
in vec4 vertexColor;
in vec2 texCoord0;
in vec2 texCoord1;
in vec4 normal;

out vec4 fragColor;

void main() {
    vec4 color = texture(Sampler0, texCoord0);

    if(color.rgb == vec3(1.0, 0.0, 1.0)) {
        vec2 pixel = floor(texCoord0 * textureSize(Sampler0, 0));
        color.rgb = hsvToRgb(vec3(0.02 * (pixel.x + pixel.y - GameTime * 24000.0), 0.6, color.b));
    }

    if (color.a < 0.1) {
        discard;
    }
    fragColor = linear_fog(color * vertexColor * ColorModulator, vertexDistance, FogStart, FogEnd, FogColor);
}
