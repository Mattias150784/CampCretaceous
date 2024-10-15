package net.mattias.campcretaceous.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mattias.campcretaceous.CampCretaceous;
import net.mattias.campcretaceous.entity.custom.AnkylosaurusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AnklyosaurusRenderer extends MobRenderer<AnkylosaurusEntity, AnklyosaurusModel<AnkylosaurusEntity>> {
    public AnklyosaurusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AnklyosaurusModel<>(pContext.bakeLayer(ModModelLayers.ANKLYOSAURUS_LAYER)), .5f);
    }

    public ResourceLocation getTextureLocation(AnkylosaurusEntity ankylosaurusEntity) {
        return new ResourceLocation(CampCretaceous.MOD_ID, "textures/entity/ankylosaurus.png");
    }

    @Override
    public void render(AnkylosaurusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
if(pEntity.isBaby()) {
    pMatrixStack.scale(0.5f,0.5f,0.5f);
}


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }




}
