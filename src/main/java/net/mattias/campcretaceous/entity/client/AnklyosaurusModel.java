
package net.mattias.campcretaceous.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mattias.campcretaceous.entity.animations.ModAnimationDefinitions;
import net.mattias.campcretaceous.entity.custom.AnkylosaurusEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;


public class AnklyosaurusModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "anklyosaurus"), "main");
	private final ModelPart Anklyosaurus;
	private final ModelPart tail1;
	private final ModelPart tail0;
	private final ModelPart head;
	private final ModelPart leg3;
	private final ModelPart leg2;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart body;

	public AnklyosaurusModel(ModelPart root) {
		this.Anklyosaurus = root.getChild("Anklyosaurus");
		this.tail1 = this.Anklyosaurus.getChild("tail1");
		this.tail0 = this.tail1.getChild("tail0");
		this.head = this.Anklyosaurus.getChild("head");
		this.leg3 = this.Anklyosaurus.getChild("leg3");
		this.leg2 = this.Anklyosaurus.getChild("leg2");
		this.leg0 = this.Anklyosaurus.getChild("leg0");
		this.leg1 = this.Anklyosaurus.getChild("leg1");
		this.body = this.Anklyosaurus.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Anklyosaurus = partdefinition.addOrReplaceChild("Anklyosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail1 = Anklyosaurus.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(46, 61).addBox(-1.0F, -1.25F, 4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-1.5F, -1.25F, 0.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -15.75F, 7.5F));

		PartDefinition tail0 = tail1.addOrReplaceChild("tail0", CubeListBuilder.create().texOffs(16, 55).addBox(-1.0F, -1.7363F, 1.8333F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4863F, 4.6667F));

		PartDefinition cube_r1 = tail0.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 10).addBox(-2.0F, -18.0F, -4.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 16.2637F, 5.8333F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = tail0.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -18.0F, -4.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 16.2637F, 5.8333F, 0.0F, 0.0F, 0.0873F));

		PartDefinition head = Anklyosaurus.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -3.112F, -10.2527F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 52).addBox(-5.0F, -4.612F, -4.2527F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 20).addBox(2.0F, -4.112F, -4.2527F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 32).addBox(2.0F, -0.112F, -3.7527F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(34, 60).addBox(-5.0F, -0.112F, -4.7527F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-4.0F, -3.112F, -3.2527F, 8.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -13.888F, -6.7473F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 52).addBox(-3.0F, -1.5F, -0.8F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.388F, -11.2527F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leg3 = Anklyosaurus.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(32, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -10.5F, 5.5F));

		PartDefinition leg2 = Anklyosaurus.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -10.5F, 5.5F));

		PartDefinition leg0 = Anklyosaurus.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(48, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -10.0F, -4.0F));

		PartDefinition leg1 = Anklyosaurus.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(16, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -10.0F, -4.0F));

		PartDefinition body = Anklyosaurus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(74, 0).addBox(-6.0F, -17.0F, -2.0F, 12.0F, 10.0F, 15.0F, new CubeDeformation(0.1F))
		.texOffs(0, 0).addBox(-6.0F, -17.0F, -2.0F, 12.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.anklyosaurus_walk, limbSwing, limbSwingAmount, 2F, 2.5F);
		this.animate(((AnkylosaurusEntity) entity).idleAnimationState, ModAnimationDefinitions.anklyosaurus_idle, ageInTicks, 1f);
		this.animate(((AnkylosaurusEntity) entity).attackAnimationState, ModAnimationDefinitions.anklyosaurus_attack, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Anklyosaurus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return Anklyosaurus;
	}
}